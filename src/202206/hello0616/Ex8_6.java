package hello0616;

public class Ex8_6 {
    public static void main(String[] args) {
        try{
            Exception e = new Exception("고의로 발생 시킴.");
            throw e; 
        }
        catch(Exception e){
            System.out.println("에러 메세지 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램이 정상 종료되었음.");
    }
}