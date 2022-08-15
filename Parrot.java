class Parrot extends Bird implements Flyer {

    @Override
    public void fly() {
        System.out.println("The parrot is flying!");
    }
}