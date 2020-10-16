package org.epragati.util;

/**
 * List of request mapping urls.
 * 
 * @author naga.pulaparthi
 *
 */

public class RequestMappingUrls {

	// dealer services
	public static final String REG_CLASS_LEVEL_URL = "/dealer";
	public static final String GET_REG_DETLS_BY_ID = "/getRegistrationDetailById";
	public static final String DEL_REG_DETLS_BY_ID = "/deleteRegistrationDetailsById";
	public static final String SAVE_REG_DETLS = "/saveRegistrationDetails";
	public static final String SLOTS_AVILABILITY = "/avilableSlots";

	// Admin URls (class: AdminController) urls
	public static final String REG_CLASS_ADMIN_LEVEL_URL = "/admin";
	public static final String REG_DASH_BOARD = "/getDashBoardDetails";
	public static final String GET_PENDING_LIST = "/getPendingList";
	public static final String GET_INVALID_COV = "/getInvalidCovs";
	public static final String SAVE_RTA_ACTION = "/saveRTAAction";
	public static final String REG_CITIZEN_DASH_BOARD = "/getServicesPendingCount";
	public static final String REG_SERVICE_PENDING_LIST = "/getServicesPendingList";
	public static final String REG_SERVICE_BY_APP_NO = "/getRegServDetailsByApplicationNo";
	public static final String REG_SERVICE_DATA_ENTRY_COUNT = "/getRegServiceDataEntryCountDetails";
	public static final String REG_SERVICE_DATA_ENTRY_DATA = "/getRegServiceDataEntryDataDetails";
	public static final String REG_SERVICE_DATA_ENTRY_VIEW = "/viewRegServiceDataEntryDataDetails";
	public static final String BODYBUILDER_SLOTS = "/bodyBuilderSlotsAvailabilty";
	public static final String UNLOCK_SERVICES_RECORD = "/unlockServiceRecord";
	public static final String REG_DASH_BOARD_MENU = "/getDashBoardDetailsMenu";

	public static final String GET_IMAGE_ACTIONS = "/getImageActions";
	public static final String UPLOAD_ENCLOSURES = "/uploadEnclosures";
	public static final String REG_BY_APPNO = "/getRegistrationDetailsByAppNo";
	public static final String GET_REGISTRATIONDETAILS_BY_PRNO = "getRegistrationDetailsByPrNo";
	public static final String GET_REGISTRATIONDETAILS_BY_TRNO = "getRegistrationDetailsByTrNo";
	public static final String GET_REG_BY_CHASSISNO_AND_ENGINENO = "getRegDetailsByChassisAndEngineNo";
	public static final String GET_SUSPEND_PENDING_LIST = "/getSuspendPendingList";
	public static final String REG_SUSPEND_DASHBOARD_COUNT = "/getSuspendDashBoardCount";
	public static final String REG_PERMIT_SUSPEND_DASHBOARD_COUNT = "/getPermitSuspendDashBoardCount";
	public static final String GET_PERMIT_SUSPEND_PENDING_LIST = "/getPermitSuspendPendingList";
	public static final String REG_PAYMENT_LIST = "/getPaymentList";
	public static final String GET_STOPPAGE_QUATIONS = "/getStoppageQuations";
	public static final String GET_STOPPAGE_REVOCATION_QUATIONS = "/getStoppageRevocationQuations";
	public static final String GET_TAX_DETAILS_FROM_CFST = "/getCfstTaxDetails";

	public static final String SECOND_VEHICLE = "secondVehicle";

	public static final String REG_SERVICE_BILATERAL_VIEW = "/viewBilateralTaxDetails";
	public static final String REG_SERVICE_BILATERAL_COUNT = "/bilateralTaxDetailsCount";
	public static final String REG_SERVICE_BILATERAL_SAVE = "/saveBilateralTaxDetails";
	public static final String GET_VEHICLE_DATA = "/getVehicleData";
	public static final String SAVE_FEE_CORRECTION = "/saveFeeCorrection";
	public static final String FEE_CORRECTION_COUNT = "/feeCorrectionCount";
	public static final String REG_SERVICE_FEE_CORRECTION_VIEW = "/viewFeeCorrectionDetails";
	public static final String FRC_AO_LOCKED_REMOVE="/frcAoLockedRemove"; 
	public static final String LOCKED_DETAILS="/getLockedDeatilsWithApplicationNo";
	// Images urls
	public static final String IMG_CLASS_LEVEL_URL = "/images";

	// 3rd party APIs urls
	public static final String API_CLASS_LEVEL_URL = "/api";

	// Financier urls
	public static final String FINANCIER_CLASS_LEVEL_URL = "/financier";
	public static final String FINANCIER_EXCEL_UPLOAD = "/uploadExcellFileAndSave";
	public static final String FINANCIER_FETCH_UPLOADED_RECORDS = "/getUploadedExcelDetails";

	public static final String FINANCIER_SIGN_UP = "/financierSignUp";

	// Master data urls
	public static final String MASTER_CLASS_LEVEL_URL = "/master";

	// Payment transaction urls
	public static final String PAYMENT_CLASS_LEVEL_URL = "/payment";

	// UsersGateWayController transaction urls
	public static final String USER_CLASS_LEVEL_URL = "/user";

	// UsersGateWayController transaction urls(class : TaxController)
	public static final String TAX_CLASS_LEVEL_URL = "/taxController";

	// citizen Services.
	public static final String COD_CLASS_LEVEL_URL = "/citizenServices";
	public static final String GET_APPLICATION_DETAILS = "/getApplicatioDetails";

	// Card print urls
	public static final String CARD_PRINT_CLASS_LEVEL_URL = "/cardPrint";

	// Cfst Sync Urls
	public static final String CFST_CLASS_LEVEL_URL = "/cfstPayment";
	public static final String CFST_INTER_CLASS_LEVEL_URL = "/cfst"; // dealer services
	// TODO: need to change the value.
	public static final String SAVE_CFST_ELS_DETAILS = "/saveElsDetails";

	// Body Builder urls
	public static final String BODY_BUILDER_ClASS_LEVEL_URL = "/bodyBuilder";
	public static final String DETLS_BY_TRNO = "/detailsByTrNo";
	public static final String SAVE_ALTERATION_DETAILS = "/saveAlterationDetails";

	// For Permits

	public static final String GET_PERMIT_MASTER_CLASS = "/getMasterPermitClass";
	public static final String GET_PERMIT_SERVICE_COMBINATIONS = "/findServiceCombinationsForPermits";
	public static final String GET_PERMIT_MASTER_TYPE = "/getMasterPermitType";
	public static final String GET_PERMIT_MASTER_GOODS = "/getMasterPermitGoods";
	public static final String GET_PERMIT_DETAILS_BY_PERMIT_PR_NUMBER = "searchApplicationByPermitOrPrNo";
	public static final String GET_RL_SERVICE_COMBINATIONS = "/findServiceCombinationsForRL";
	public static final String GET_RL_STATEWISE_RECORDS = "/findRlStateWiseRecords";
	public static final String GET_NOOFMONTHS_FOR_ALLINDIAPERMIT = "/getNoOfMonthsForAllIndiaPermit";
	public static final String GET_PERMITDETAILS_FOR_PASSENGERLIST = "/getPermitdetailsForPassengerList";
	public static final String SAVE_PASSENGERLIST_FOR_TP = "/savePassengerListForTP";
	public static final String SAVE_OTHERSTATE_TPDETAILS = "/saveOtherStateTPDetails";
	public static final String GET_OTHERSTATE_TPDETAILS = "/getOtherStateTPDetails";

	// For verify pay
	public static final String VERIFYPAY_CLASS_LEVEL_URL = "/verifyPay";

	public static final String GET_SECOND_VEHICLE_DETAILS = "getSecondVehicleDetails";
	public static final String RELEASE_SECOND_VEHICLE = "releaseSecondVehicle";

	public static final String GET_SURRENDER_PERMIT_RECORDS_URL = "/getPermitSurrenderRecords";

	// mobile Services.
	public static final String MOB_CLASS_LEVEL_URL = "/mobileServices";

	// Tax Data Entry to RTO
	public static final String REG_CORRECTION_DATA_ENTRY = "/getCorrectionDataEntryDetails";
	public static final String REG_SAVE_CORRECTION_DATA = "/saveCorrectionData";
	public static final String REG_ALL_SAVE_CORRECTION_DATA = "/saveAllCorrectionData";

	public static final String REG_DIFF_TAX_DATA_ENTRY = "/getDiffTaxDetails";
	public static final String REG_SAVE_DIFF_TAX_DATA = "/saveDiffTaxDetails";

	// UserManagement
	public static final String REG_USER_MGMT = "/userManagement";

	// Mobile APP Authentication URL's
	public static final String GENERATE_OTP_URL = "/generateOTP";
	public static final String NEW_USER_URL = "/createUser";
	public static final String LOGIN_USER_URL = "/loginUser";
	public static final String VERIFY_OTP_URL = "/verifyOTP";
	public static final String FORGOT_PASSWORD_URL = "/forgotPassword";
	public static final String VERIFICATION_OTP_URL = "/verificationOTP";
	public static final String GET_USER_DETAILS_BY_USER_NAME_URL = "/getUserDetailsByUserName";
	public static final String MOBILE_OTP_VERIFICATION_AUTH_URL = "/mobileOtpVerificationAuth";

	// Scheduler urls
	public static final String SCHEDULER_CLASS_LEVEL_URL = "/schedulers";

	public static final String GET_FRESHRC_COUNT = "/getFreshRcforFinanceDashBoardCount";
	public static final String GET_FRESHRC_LIST = "/getFreshRcforFinanceList";

	// EIBT
	public static final String REG_CLASS_EIBT_URL = "/eibtRegistration";

	// Motor Driving school
	public static final String REG_CLASS_MDS_URL = "/motordrivingschool";

	public static final String GET_MOBILE_SERVICE_COMBINATIONS = "/findServiceCombinationsForMobile";

	public static final String SERVICES_PAYMENT = "/microSevicesPayment";

	// Get tax details at cco level
	public static final String REG_TAX_DETAILS = "/getTaxDetails";

	//
	public static final String REPORTS = "/paymentReports";

	// VCR
	public static final String VCR_DETAILS = "/vcr";
	// INSURANCE
	public static final String INSURANCE_DETAILS = "/api/insurance";
	public static final String SAVE_INSURANCE_DETAILS = "/vCancellationInfo";
	public static final String INSURANCE_CANCELLATION_INFO = "/vCancellationVerification";

	// Get vahanSync
	public static final String REG_VAHAN_CLASS_LEVEL_URL = "/regvahanPort";

	// RC Cancellation
	public static final String RC_CANCELLATION_URL = "/rcCancellation";

	// ShowCause
	public static final String SHOW_CAUSE_RTO_URL = "/saveRtaActionForShowCause";
	public static final String GET_SHOW_CAUSE_DETAILS_BULK = "/getShowCauseDetails";
	public static final String GET_SHOW_CAUSE_DETAILS_SINGLE = "/getShowCauseDetailsSingle";

	public static final String STOPPAGE_PENDING_LIST = "/getStoppagePendingList";
	public static final String SAVE_MVINAME_IN_STOPPAGE = "/saveMviNameInStoppage";
	public static final String STOPPAGE_GRID = "/stoppageList";
	public static final String SAVE_STOPPAGE_REVOCATION = "/saveStoppageRevocation";

	public static final String COMMON_AUTHENTICATION = "/commonAuth";

	public static final String SCRT_CLASS_LEVEL_URL = "/stageCarriage";
	public static final String SCRT_PENDING_LIST = "/getStageCarriagePendingList";
	public static final String SCRT_DETAILS_APPNO = "/getStageCarriageByAppNO";
	public static final String SCRT_SAVE = "/saveScrtServices";
	
	public static final String STOPPAGE_COUNT = "/stoppagecountForApp";
	
	public static final String COMMON_DEEMED = "/microSevicesDeemed";
	
	//tickets
	public static final String TICKET_GENERATION="/ticketGeneration";
	
	public static final String REPORT_TICKETS="/ticketReports";
	
	public static final String MASTER_TICKETS="/masterTickets";
	
	
}
