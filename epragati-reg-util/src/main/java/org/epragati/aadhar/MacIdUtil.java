package org.epragati.aadhar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
/**
 * MacIdUtil for capturing Server MacID from console  it's work for below OS systems
 * Windows,Linux,Mac,HP-UX,NeXTStep,Solaris,SunOS,FreeBSD,NetBSD,OpenBSD,
 * IRIX,AIX,Tru64,Caldera,UnixWare and OpenUNIX. 
 * 
 * @author naga.pulaparthi
 *
 */
@Component
public class MacIdUtil {

	private static final Logger logger = LoggerFactory.getLogger(MacIdUtil.class);

	private String macId;

	/**
	 * Returning the macid of current machine. Save the value into macId field
	 * @param isQA TODO
	 * 
	 * @return
	 */
	public Optional<String> getMacId(boolean isQA) {

		
		// below code is for UnitTest Case 
		if(isQA){
			return Optional.of("10-20-AB");
		}
		
		if (StringUtils.isNotBlank(macId)) {
			return Optional.of(macId);
		}
		
		synchronized (this) {
			if (StringUtils.isNotBlank(macId)) {
				return Optional.of(macId);
			}

			Optional<String> optional = getMacAddress();
			if (optional.isPresent()) {
				//Remove the - symbols
				macId = optional.get().replaceAll("-", "");;
				return Optional.of(macId);
			}
		}

		return Optional.empty();
	}
	
	private Optional<String> getMacAddress() {
		String command = "ifconfig";

		String osName = System.getProperty("os.name");
		logger.info("Operating System is [{}]", osName);

		if (osName.startsWith("Windows")) {
			command = "ipconfig /all";
		} else if (osName.startsWith("Linux") || osName.startsWith("Mac") || osName.startsWith("HP-UX")
				|| osName.startsWith("NeXTStep") || osName.startsWith("Solaris") || osName.startsWith("SunOS")
				|| osName.startsWith("FreeBSD") || osName.startsWith("NetBSD")) {
			command = "ifconfig -a";
		} else if (osName.startsWith("OpenBSD")) {
			command = "netstat -in";
		} else if (osName.startsWith("IRIX") || osName.startsWith("AIX") || osName.startsWith("Tru64")) {
			command = "netstat -ia";
		} else if (osName.startsWith("Caldera") || osName.startsWith("UnixWare") || osName.startsWith("OpenUNIX")) {
			command = "ndstat";
		} else {// Note: Unsupported system.
			logger.warn("The current operating system [{}] is not supported.", osName );
			return Optional.empty();
		}

		String macAddress = null;
		try (BufferedReader in = new BufferedReader(
				new InputStreamReader(Runtime.getRuntime().exec(command).getInputStream()))) {
			Pattern p = Pattern.compile("([\\w]{1,2}(-|:)){5}[\\w]{1,2}");
			while (true) {
				String line = in.readLine();

				if (StringUtils.isBlank(line)) {
					logger.warn("line is null");
					continue;
				}

				logger.info("line [{}]",  line);
				Matcher m = p.matcher(line);
				if (m.find()) {
					macAddress = m.group();
					break;
				}
			}
		} catch (IOException ioException) {
			logger.error("Exception occured while getting mac id.", ioException);
		}
		if (StringUtils.isEmpty(macAddress)) {
			return Optional.empty();
		}
		return Optional.of(macAddress);
	}
}
