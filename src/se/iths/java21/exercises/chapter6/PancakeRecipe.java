package se.iths.java21.exercises.chapter6;

public class PancakeRecipe {
    private final static float[] BATCH_REQUIRED_AMOUNT = {2.5f, 6f, 3f, .5f, .5f};
    private final static float REQURIED_FLOUR_AMOUNT = 2.5f;
    private final static float REQURIED_MILK_AMOUNT = 6f;
    private final static float REQURIED_EGG_AMOUNT = 3f;
    private final static float REQURIED_SALT_AMOUNT = .5f;
    private final static float REQURIED_BUTTER_AMOUNT = .5f;
    private float flourAmount;
    private float milkAmount;
    private float eggAmount;
    private float saltAmount;
    private float butterAmount;

    public PancakeRecipe() {
        this.flourAmount = REQURIED_FLOUR_AMOUNT;
        this.milkAmount = REQURIED_MILK_AMOUNT;
        this.eggAmount = REQURIED_EGG_AMOUNT;
        this.saltAmount = REQURIED_SALT_AMOUNT;
        this.butterAmount = REQURIED_BUTTER_AMOUNT;
    }

    public PancakeRecipe(float flourAmount, float milkAmount, float eggAmount, float saltAmount, float butterAmount) {
        this.flourAmount = flourAmount;
        this.milkAmount = milkAmount;
        this.eggAmount = eggAmount;
        this.saltAmount = saltAmount;
        this.butterAmount = butterAmount;
    }

    public boolean canMakePancakes() {
        return flourAmount >= REQURIED_FLOUR_AMOUNT &&
                milkAmount >= REQURIED_MILK_AMOUNT &&
                eggAmount >= REQURIED_EGG_AMOUNT &&
                saltAmount >= REQURIED_SALT_AMOUNT &&
                butterAmount >= REQURIED_BUTTER_AMOUNT;
    }

    public void makePancakes() {
        if (canMakePancakes()) {
            flourAmount -= REQURIED_FLOUR_AMOUNT;
            milkAmount -= REQURIED_MILK_AMOUNT;
            eggAmount -= REQURIED_EGG_AMOUNT;
            saltAmount -= REQURIED_SALT_AMOUNT;
            butterAmount -= REQURIED_BUTTER_AMOUNT;
            System.out.println("Batch coming up!");
            makePancakes();
        } else {
            System.out.println("Not enough ingridients...");
        }
//        while (canMakePancakes()) {
//            flourAmount -= REQURIED_FLOUR_AMOUNT;
//            milkAmount -= REQURIED_MILK_AMOUNT;
//            eggAmount -= REQURIED_EGG_AMOUNT;
//            saltAmount -= REQURIED_SALT_AMOUNT;
//            butterAmount -= REQURIED_BUTTER_AMOUNT;
//            System.out.println("Batch coming up!");
//        }
//        System.out.println("Not enough ingridients...");
    }

    public static void main(String[] args) {
        PancakeRecipe batch1 = new PancakeRecipe();
        PancakeRecipe batch2 = new PancakeRecipe(100f,100f,100f,100f,100f);
        batch1.makePancakes();
        batch2.makePancakes();
    }


}
