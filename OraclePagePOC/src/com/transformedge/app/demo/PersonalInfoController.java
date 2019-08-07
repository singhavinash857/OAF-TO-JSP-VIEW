package com.transformedge.app.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.transformedge.app.entity.Person;

public class PersonalInfoController {

	public void  getPersonalDetails() {
		Connection connection  = DBConfigurations.getConnectionInstance();
		try {
			PreparedStatement pstmt = connection.prepareStatement("select * from per_all_people_f where person_id = ?");
			pstmt.setInt(1, 31440);
			ResultSet resultSet = pstmt.executeQuery();
			Person per = new Person();
			mapToObject(per,resultSet);
			System.out.println(per);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void mapToObject(Person per, ResultSet resultSet) throws SQLException {
		while(resultSet.next()) {
			per.setpERSON_ID(resultSet.getInt("PERSON_ID"));
			per.seteFFECTIVE_START_DATE(resultSet.getDate("EFFECTIVE_START_DATE"));
			per.seteFFECTIVE_END_DATE(resultSet.getDate("EFFECTIVE_END_DATE"));
			per.setbUSINESS_GROUP_ID(resultSet.getInt("BUSINESS_GROUP_ID"));
			per.setpERSON_TYPE_ID(resultSet.getInt("PERSON_TYPE_ID"));
			per.setlAST_NAME(resultSet.getString("LAST_NAME"));
			per.setsTART_DATE(resultSet.getDate("START_DATE"));
			per.setcOMMENT_ID(resultSet.getInt("COMMENT_ID"));
			per.setaPPLICANT_NUMBER(resultSet.getString("APPLICANT_NUMBER"));
			per.setcURRENT_APPLICANT_FLAG(resultSet.getString("CURRENT_APPLICANT_FLAG"));
			per.setcURRENT_EMP_OR_APL_FLAG(resultSet.getString("CURRENT_EMP_OR_APL_FLAG"));
			per.setcPPLICANT_NUMBER(resultSet.getString("CURRENT_EMPLOYEE_FLAG"));
			per.setdATE_EMPLOYEE_DATA_VERIFIED(resultSet.getDate("DATE_EMPLOYEE_DATA_VERIFIED"));
			per.setdATE_OF_BIRTH(resultSet.getDate("DATE_OF_BIRTH"));
			per.seteMAIL_ADDRESS(resultSet.getString("EMAIL_ADDRESS"));
			per.seteMPLOYEE_NUMBER(resultSet.getString("EMPLOYEE_NUMBER"));
			per.seteXPENSE_CHECK_SEND_TO_ADDRESS(resultSet.getString("EXPENSE_CHECK_SEND_TO_ADDRESS"));
			per.setfIRST_NAME(resultSet.getString("FIRST_NAME"));
			per.setfULL_NAME(resultSet.getString("FULL_NAME"));
			per.setkNOWN_AS(resultSet.getString("KNOWN_AS"));
			per.setmARITAL_STATUS(resultSet.getString("MARITAL_STATUS"));
			per.setmIDDLE_NAMES(resultSet.getString("MIDDLE_NAMES"));
			per.setnATIONALITY(resultSet.getString("NATIONALITY"));
			per.setnATIONAL_IDENTIFIER(resultSet.getString("NATIONAL_IDENTIFIER"));
			per.setpREVIOUS_LAST_NAME(resultSet.getString("PREVIOUS_LAST_NAME"));
			per.setrEGISTERED_DISABLED_FLAG(resultSet.getString("REGISTERED_DISABLED_FLAG"));
			per.setsEX(resultSet.getString("SEX"));
			per.settITLE(resultSet.getString("TITLE"));
			per.setwORK_TELEPHONE(resultSet.getString("WORK_TELEPHONE"));
			per.setaTTRIBUTE_CATEGORY(resultSet.getString("ATTRIBUTE_CATEGORY"));
			per.setvENDOR_ID(resultSet.getInt("VENDOR_ID"));
			per.setpER_INFORMATION_CATEGORY(resultSet.getString("PER_INFORMATION_CATEGORY"));
			per.setpER_INFORMATION1(resultSet.getString("PER_INFORMATION1"));
			per.setpER_INFORMATION2(resultSet.getString("PER_INFORMATION2"));
			per.setpER_INFORMATION3(resultSet.getString("PER_INFORMATION3"));
			per.setpER_INFORMATION4(resultSet.getString("PER_INFORMATION4"));
			per.setPER_INFORMATION5(resultSet.getString("PER_INFORMATION5"));
			per.setpER_INFORMATION6(resultSet.getString("PER_INFORMATION6"));
			per.setpER_INFORMATION7(resultSet.getString("PER_INFORMATION7"));
			per.setpER_INFORMATION8(resultSet.getString("PER_INFORMATION8"));
			per.setpER_INFORMATION9(resultSet.getString("PER_INFORMATION9"));
			per.setpER_INFORMATION10(resultSet.getString("PER_INFORMATION10"));
			per.setpER_INFORMATION11(resultSet.getString("PER_INFORMATION11"));
			per.setpER_INFORMATION12(resultSet.getString("PER_INFORMATION12"));
			per.setpER_INFORMATION13(resultSet.getString("PER_INFORMATION13"));
			per.setpER_INFORMATION14(resultSet.getString("PER_INFORMATION14"));
			per.setpER_INFORMATION15(resultSet.getString("PER_INFORMATION15"));
			per.setpER_INFORMATION16(resultSet.getString("PER_INFORMATION16"));
			per.setpER_INFORMATION17(resultSet.getString("PER_INFORMATION17"));
			per.setpER_INFORMATION18(resultSet.getString("PER_INFORMATION18"));
			per.setpER_INFORMATION19(resultSet.getString("PER_INFORMATION19"));
			per.setpER_INFORMATION20(resultSet.getString("PER_INFORMATION20"));
			per.setbACKGROUND_CHECK_STATUS(resultSet.getString("BACKGROUND_CHECK_STATUS"));
			per.setbLOOD_TYPE(resultSet.getString("BLOOD_TYPE"));
			per.setcORRESPONDENCE_LANGUAGE( resultSet.getString("CORRESPONDENCE_LANGUAGE"));
			per.setfAST_PATH_EMPLOYEE(resultSet.getString("FAST_PATH_EMPLOYEE"));
			per.sethONORS(resultSet.getString("HONORS"));
			per.setiNTERNAL_LOCATION(resultSet.getString("INTERNAL_LOCATION"));
			per.setlAST_MEDICAL_TEST_BY(resultSet.getString("LAST_MEDICAL_TEST_BY"));
			per.setmAILSTOP(resultSet.getString("MAILSTOP"));
			per.setoFFICE_NUMBER(resultSet.getString("OFFICE_NUMBER"));
			per.setoN_MILITARY_SERVICE(resultSet.getString("ON_MILITARY_SERVICE"));
			per.setoRDER_NAME(resultSet.getString("ORDER_NAME"));
			per.setpRE_NAME_ADJUNCT(resultSet.getString("PRE_NAME_ADJUNCT"));
			per.setrEHIRE_AUTHORIZOR(resultSet.getString("REHIRE_AUTHORIZOR"));
			per.setrEHIRE_RECOMMENDATION(resultSet.getString("REHIRE_RECOMMENDATION"));
			per.setrESUME_EXISTS(resultSet.getString("RESUME_EXISTS"));
			per.setsECOND_PASSPORT_EXISTS(resultSet.getString("SECOND_PASSPORT_EXISTS"));
			per.setsTUDENT_STATUS(resultSet.getString("STUDENT_STATUS"));
			per.setsUFFIX(resultSet.getString("SUFFIX"));
			per.setwORK_SCHEDULE(resultSet.getString("WORK_SCHEDULE"));
			per.setpER_INFORMATION21(resultSet.getString("PER_INFORMATION21"));
			per.setpER_INFORMATION22(resultSet.getString("PER_INFORMATION22"));
			per.setpER_INFORMATION23(resultSet.getString("PER_INFORMATION23"));
			per.setpER_INFORMATION24(resultSet.getString("PER_INFORMATION24"));
			per.setpER_INFORMATION25(resultSet.getString("PER_INFORMATION25"));
			per.setpER_INFORMATION26(resultSet.getString("PER_INFORMATION26"));
			per.setpER_INFORMATION27(resultSet.getString("PER_INFORMATION27"));
			per.setpER_INFORMATION28(resultSet.getString("PER_INFORMATION28"));
			per.setpER_INFORMATION29(resultSet.getString("PER_INFORMATION29"));
			per.setpER_INFORMATION30(resultSet.getString("PER_INFORMATION30"));
			per.setbACKGROUND_DATE_CHECK(resultSet.getDate("BACKGROUND_DATE_CHECK"));
			per.sethOLD_APPLICANT_DATE_UNTIL(resultSet.getDate("HOLD_APPLICANT_DATE_UNTIL"));
			per.setlAST_MEDICAL_TEST_DATE(resultSet.getDate("LAST_MEDICAL_TEST_DATE"));
			per.setpROJECTED_START_DATE(resultSet.getDate("PROJECTED_START_DATE"));
			per.setrESUME_LAST_UPDATED(resultSet.getDate("RESUME_LAST_UPDATED"));
			per.setdATE_OF_DEATH(resultSet.getDate("DATE_OF_DEATH"));
			per.setrEHIRE_REASON(resultSet.getString("REHIRE_REASON"));
			per.setcOORD_BEN_MED_PLN_NO(resultSet.getString("COORD_BEN_MED_PLN_NO"));
			per.setcOORD_BEN_NO_CVG_FLAG(resultSet.getString("COORD_BEN_NO_CVG_FLAG"));
			per.setdPDNT_ADOPTION_DATE(resultSet.getDate("DPDNT_ADOPTION_DATE"));
			per.setrECEIPT_OF_DEATH_CERT_DATE(resultSet.getDate("RECEIPT_OF_DEATH_CERT_DATE"));
			per.setoRIGINAL_DATE_OF_HIRE(resultSet.getDate("ORIGINAL_DATE_OF_HIRE"));
			per.setcOORD_BEN_MED_CVG_STRT_DT(resultSet.getDate("COORD_BEN_MED_CVG_STRT_DT"));
			per.setcOORD_BEN_MED_CVG_END_DT(resultSet.getDate("COORD_BEN_MED_CVG_END_DT"));
			per.setfTE_CAPACITY(resultSet.getFloat("FTE_CAPACITY"));
			per.setoBJECT_VERSION_NUMBER(resultSet.getInt("OBJECT_VERSION_NUMBER"));
			per.setbENEFIT_GROUP_ID(resultSet.getInt("BENEFIT_GROUP_ID"));
			per.setpARTY_ID(resultSet.getInt("PARTY_ID"));
			per.setdPDNT_VLNTRY_SVCE_FLAG(resultSet.getString("DPDNT_VLNTRY_SVCE_FLAG"));
			per.setuSES_TOBACCO_FLAG(resultSet.getString("USES_TOBACCO_FLAG"));
			per.settOWN_OF_BIRTH(resultSet.getString("TOWN_OF_BIRTH"));
			per.setcOORD_BEN_MED_PL_NAME(resultSet.getString("COORD_BEN_MED_PL_NAME"));
			per.setcOORD_BEN_MED_INSR_CRR_NAME(resultSet.getString("COORD_BEN_MED_INSR_CRR_NAME"));
			per.setcOORD_BEN_MED_INSR_CRR_IDENT(resultSet.getString("COORD_BEN_MED_INSR_CRR_IDENT"));
			per.setcOORD_BEN_MED_EXT_ER(resultSet.getString("COORD_BEN_MED_EXT_ER"));
			per.setrEGION_OF_BIRTH(resultSet.getString("REGION_OF_BIRTH"));
			per.setcOUNTRY_OF_BIRTH(resultSet.getString("COUNTRY_OF_BIRTH"));
			per.setgLOBAL_PERSON_ID(resultSet.getString("GLOBAL_PERSON_ID"));
			per.setnPW_NUMBER(resultSet.getString("NPW_NUMBER"));
			per.setcURRENT_NPW_FLAG(resultSet.getString("CURRENT_NPW_FLAG"));
			per.setgLOBAL_NAME(resultSet.getString("GLOBAL_NAME"));
			per.setlOCAL_NAME(resultSet.getString("LOCAL_NAME"));
			
		}
	}
}
