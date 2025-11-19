public class MadLib {

    public static void main(String[] args) {
        MadLib madlib = new MadLib();
    }

    public MadLib() {
        String classmate = "Sam";
        String city = "South Africa";
        String noun = "clothes";
        String adjective = "cold";
        String pluralNoun = "books";
        String pluralAnimal = "pythons";
        boolean trueOrFalse = true;
        double decimalBiggerThan1 = 36.6;
        int number1 = 8;
        int number2 = 3;
        int wholeNumberBetween1And4 = 3;
        String miltonTeacher = "T Gags";
        String miltonDean = "Mrs Letham";
        char letterGrade = 'A';
        String season = "summer";
    //define a string called story for mad lib
    String story =  "This weekend I am going camping with "
            +classmate+ ". We are going to a campsite in "
            +city+ ". I packed my "+noun+ " and "
            +pluralNoun + ".  The forecast is calling for a high of "
            +decimalBiggerThan1+ " degrees fahrenheit. So it should be a "
            +adjective+" day! This year, the park rangers have seen "
            +number1+ " " +pluralAnimal + " which seems kind of dangerous. "
            +miltonTeacher+" said it's " + trueOrFalse + " that "+pluralAnimal+ " eat class "
            +wholeNumberBetween1And4+ " students in the " +season+ ". But, "
            +miltonDean+ " said it actually has only happened "
            + number2+" times. Wish us luck! If we survive, we will earn a "
            +letterGrade+ "- in P.E. class.";


        System.out.println(story);}




}
