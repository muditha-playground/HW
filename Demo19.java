void main(){
//    int x=0;
//    int y=5;
//
//
//    while (x++<5){
//
//        y=6-x;
//        while (y-->0) {
//            System.out.print("* ");
//
//        }
//        System.out.println();
//
//
//    }


    int x=5;
    int z=5;
    int y=0;
    while (y++<15){
        System.out.print(y==z?"\n":"* ");
        if (y==z){
            z+=x--;
        }


        }



}