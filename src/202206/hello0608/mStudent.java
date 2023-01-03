package hello0608;


public class mStudent extends Student{
    // Middle Students has grade, class, 4 subjects and score of six semesters per subject.
    int mGrade;
    int mVan;
    String [] mSubject = {"Kor", "Eng", "Math", "Sci"};
    double [][] mSubjectScore = new double [4][6];


    //Constructor
    public mStudent(){
        this.mGrade = 0;
        this.mVan = 0;                   
    }

    public mStudent(String _name, int _birth, String _sex, int _mGrade, int _mVan, double [][] mScore){
        super(_name, _birth, _sex);
        this.mGrade = _mGrade;
        this.mVan = _mVan;           
        this.mSubjectScore = mScore;
    }
    
    //set Score
    public void setScore(double [][] mScore){
        this.mSubjectScore = mScore;
    }


    //Method
    //Average by subjects
    public void aveSub(String sub){
        double result = 0f;
        double totalScore = 0f;

        if(sub.equals("Kor")){
            for(int i=0; i<mSubjectScore[0].length; i++){
                totalScore += mSubjectScore[0][i];
            }
        }
        else if(sub.equals("Eng")){
            for(int i=0; i<mSubjectScore[1].length; i++){
                totalScore += mSubjectScore[1][i];
            }
        }
        else if(sub.equals("Math")){
            for(int i=0; i<mSubjectScore[2].length; i++){
                totalScore += mSubjectScore[2][i];
            }
        }
        else if(sub.equals("Sci")){
            for(int i=0; i<mSubjectScore[3].length; i++){
                totalScore += mSubjectScore[3][i];
            }
        }
        else{
            result = 0f;
        }
        result = totalScore /  mSubjectScore[0].length;
        System.out.println(sub + "Average is " + Math.ceil(result));
    }
    //Average by terms
    public void aveTerms(String terms){
        double result = 0.0f;
        double totalScore = 0.0f;

        if(terms.equals("1-1")){
            for(int i=0; i<mSubjectScore.length; i++){
                totalScore += mSubjectScore[i][0];
            }
        }
        else if(terms.equals("1-2")){
            for(int i=0; i<mSubjectScore.length; i++){
                totalScore += mSubjectScore[i][1];
            }
        }
        else if(terms.equals("2-1")){
            for(int i=0; i<mSubjectScore.length; i++){
                totalScore += mSubjectScore[i][2];
            }
        }
        else if(terms.equals("2-2")){
            for(int i=0; i<mSubjectScore.length; i++){
                totalScore += mSubjectScore[i][3];
            }
        }
        else if(terms.equals("3-1")){
            for(int i=0; i<mSubjectScore.length; i++){
                totalScore += mSubjectScore[i][4];
            }
        }
        else if(terms.equals("3-2")){
            for(int i=0; i<mSubjectScore.length; i++){
                totalScore += mSubjectScore[i][5];
            }
        }
        else{
            result = 0f;
        }
        result = totalScore /  mSubjectScore[0].length;
        System.out.println(terms + "Average is " + Math.ceil(result));
    }
    //Average by grade.
    public void aveGrade(int grade){
        double result = 0;
        double total = 0;
        for(int i=0; i<mSubjectScore.length; i++){
            for(int j=0; j<mSubjectScore[i].length; j++){
                total += mSubjectScore[i][j];
            }
        }
        result = total / (mSubjectScore.length*mSubjectScore[0].length);
        
        System.out.println(grade + " Grade Average is "+ Math.ceil(result));
    }



    // ID OUTPUt
    @Override
    public void getID(){
        super.getID();
        System.out.println("Grade : " + mGrade);
        System.out.println("Van : " + mVan);
    }
}
