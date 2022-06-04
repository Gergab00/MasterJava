
class Fibonacci{

    public static void main(String[] args) {
        int sec = 0;
        int ant = 1;
        for(int i = 0; i < 35; i++){
            sec+=ant;
            ant = sec;
            System.out.println(sec);
        }

    }

}


