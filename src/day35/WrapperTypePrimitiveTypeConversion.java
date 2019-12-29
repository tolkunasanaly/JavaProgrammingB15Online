package day35;

public class WrapperTypePrimitiveTypeConversion {
    public static void main(String[] args) {
        // Use this number IPR2012-00001 and store the year into a int variable
// This case number always start with 3 character either IPR , PGR , CBM , DER
// followed by year , followed by dash and 5 digit number
        String caseNumber = "IPR2012-00001" ;
        int year ; //-- get 2012 out of it

//        String strYear = caseNumber.substring(3,7);
//        year = Integer.parseInt(strYear);
//        System.out.println("strYear = " + strYear);

        System.out.println(getYearOutOfCaseNumber("DER2019-00342"));
        System.out.println(getYearOutOfCaseNumber("IPR2009-01042"));
        System.out.println(getYearOutOfCaseNumber("CBM2001-00348"));
    }

    public static int getYearOutOfCaseNumber (String caseNumber){
        //do validation on case number
        //TODO : Case number should always start with either
        /// CBM,IPR, PGR, DER
        //FOLLOWED BY 4 DIGIT NUMBER
        //FOLLOWED BY -
        //FOLLOWED BY 5 DIGIT

        int year ; //-- get 2012 out of it
/*             1st VERSION*/
//        String strYear = caseNumber.substring(3,7);
//        year = Integer.parseInt(strYear);
//        return year;
        /*             2nd VERSION*/
        return Integer.parseInt(caseNumber.substring(3,7));

    }

}
