public class Zoo
{
    public static void main(String[] args)
    {
        elephant elephant1 = new elephant();
        System.out.println(elephant1.name);

        elephant elephant2 = new elephant(4000, true, "Little Timmy");
        System.out.println(elephant2.name);
        System.out.println(elephant2.weight);
        System.out.println(elephant2.hasTusks);
    }
}