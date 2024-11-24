public class DataTypes2 {
    public static void main(String[] args) {
        
         System.out.println(((Object)(456767)).getClass().getSimpleName());
         System.out.println(((Object)(45676l)).getClass().getSimpleName());
         System.out.println(((Object)(4567.67)).getClass().getSimpleName());
         System.out.println(((Object)(4567.67f)).getClass().getSimpleName());
         System.out.println(((Object)('f')).getClass().getSimpleName());
         System.out.println(((Object)(456767+"")).getClass().getSimpleName());
         getDataType('g');
         getDataType(456767);
         getDataType(45676l);
         getDataType(4567.67);
         getDataType(4567.67f);
         getDataType(456767+"");



    }

    public static void getDataType(Object literalValue){
System.out.println(" Datatype :"+literalValue.getClass().getSimpleName());
    }
    
}
