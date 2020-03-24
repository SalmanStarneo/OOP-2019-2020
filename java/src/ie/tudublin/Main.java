package ie.tudublin;

public class Main
{

    public void soundSynthesis()
	{
		final String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new SoundSynthesis());
    }
    public void starMap()
	{
		final String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new StarMap());
    }
    public void helloArrays()
	{
		final String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new ArraysExample());
    }

    public void helloProcessing()
	{
		final String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new HelloProcessing());
    }
    public void loops()
    {
		final String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Loops());
    }
    
    public void bugZap()
	{
		final String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new BugZap());
    }
    
    public void sound1()
	{
		final String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Sound1());
    }

    public void sound2()
	{
		final String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Sound2());
    }

    public void sound3()
	{
		final String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Sound3());
    }

    public void audioBands()
	{
		final String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new AudioBands());
    }

    public void airSeaBattle()
	{
		final String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new AirSeaBattle());
    }

    public void soundMandala()
    {
        final String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new SoundMandala());
    }
    
    public void dogsCats()
    {
        // Polymorphism means
        // The type is a superclass, the instance is a subclass

        // This is not polymorphism
        final Cat topcat = new Cat("Topcat");

        // This is polymorphism!
        Animal mino = new Cat("Mino");
        // A vitual method!
        // Dynamic binding
        mino.speak();
        // This wont compile!!
        //System.out.println(mino.getNumLives());
        // This is an example of a cast
        System.out.println(((Cat)mino).getNumLives());

        mino = new Dog("Misty");  // This will compile!
        //topcat = new Dog("Tara"); // This wont compile!

        Animal a = new Cat("a");
        final Animal b = new Cat("b");
        
        System.out.println(a);
        System.out.println(b);

        a = b;

        a.setName("c");

        System.out.println(a);
        System.out.println(b);

        // c c will get printed out because 
        // a & b are object references

    }
    
    public static void main(final String[] arg)
    {
        final Main main = new Main();
		main.PitchSpeller();        
    }

    private void PitchSpeller() {

        PitchSpeller ps = new PitchSpeller();
        System.out.println(ps.spell(330));
        System.out.println(ps.spell(420));
        System.out.println(ps.spell(1980));
    }
}