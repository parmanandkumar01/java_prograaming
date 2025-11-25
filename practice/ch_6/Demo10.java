package practice.ch_6;

// labelled break to go to end of a block
public class Demo10 {
    public static void main(String[] args) {
        boolean x = true;
        bl1: {
            bl2: {
                bl3: {
                    System.out.println("Block3");
                    if (x) {
                        break bl2;// go out of block 2
                    }
                } // end of block2
                System.out.println("Block2");
            } // end of block3
            System.out.println("Block 1");
        } // end of block1
        System.out.println("Out of blocks");
    }
}
