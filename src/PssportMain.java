public class PssportMain {
    public static void main(String[]args){
        EmigrationProcess emigrationProcess = new EmigrationProcess();
        PassPort passPort = new PassPort("ADABALA DINESH","20/08/1997","AMALAPURAM","15/03/2019","30/12/2027");

        System.out.println(emigrationProcess.booking(passPort));
    }
}
