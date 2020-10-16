package org.epragati.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JScriptEngine {

	private static final Logger logger = LoggerFactory.getLogger(JScriptEngine.class);


	@Value("${script.engine.name}")
	private static String scriptEngineName;

	private static Map<String, Invocable> invocaBleCache = new HashMap<String, Invocable>();

	static ScriptEngine engine = null;

	private static ScriptEngine getJSInstance() {

		if (engine == null) {
			engine = new ScriptEngineManager().getEngineByName("nashorn");
		}
		return engine;
	}

	/**
	 * Loads the Script File
	 * @param fileName
	 * @return
	 * @throws FileNotFoundException
	 * @throws ScriptException
	 */
	private Invocable loadScript(String fileName) throws FileNotFoundException, ScriptException {

		Invocable invocable = null;

		try {

			ScriptEngine engine = getJSInstance();
			ClassLoader classLoader = getClass().getClassLoader();
			File file = new File(URLDecoder.decode(classLoader.getResource(fileName).getFile(),"UTF-8"));
			engine.eval(new FileReader(file));
			invocable = (Invocable) engine;
		} catch (FileNotFoundException | ScriptException | UnsupportedEncodingException e) {
			logger.error(e.getMessage());
		}

		return invocable;

	}

	public Invocable getInvocableObj(String contexName) throws FileNotFoundException, ScriptException {

		Invocable invocable = invocaBleCache.get(contexName);

		if (invocaBleCache == null) {
			invocaBleCache = new HashMap<String, Invocable>();
		}

		invocable = invocaBleCache.get(contexName);
		if (invocable == null) {
			logger.info("Not Find in Cache - for [{}]", contexName);
			invocable = loadScript(contexName);
			invocaBleCache.put(contexName, invocable);
		}

		return invocable;
	}
}
