package JavaGuruLearning.Inheritance.Luxoft.Task1;

class StringTask {
    public static int fourLetters(String names) {
        // Write your code here...
        int sum = 0;
        int k = 0;
        char[] st = names.toCharArray();

        for (int i=0; i<st.length; i++){
            k+=1;
            if (st[i]==' '){
                if (k==5){
                    sum++;

                }
                k=0;
            }
            if (i==st.length-1){
                if (k==4){
                    sum++;

                }
                k=0;
            }

        }
        return sum;
    }
}
