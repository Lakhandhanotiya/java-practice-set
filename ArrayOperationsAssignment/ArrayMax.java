class Max{
    public static void main(String[] args) {
        int Array[]={10,20,30,40,50};
        int max=Array[0];
        for(int i=0; i<Array.length;i++){
            if(max<Array[i]){
                max=Array[i];
            }
        }
        System.out.println(max);
    }

}