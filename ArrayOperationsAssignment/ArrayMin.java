class Min{
    public static void main(String[] args) {
        int Array[]={10,20,30,40,50};
        int min=Array[0];
        for(int i=0; i<Array.length;i++){
            if(min>Array[i]){
                
                min=Array[i];
            }
        }
        System.out.println(min);
    }

}