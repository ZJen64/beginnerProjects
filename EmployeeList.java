public class EmployeeList {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        List<String> empNames= new ArrayList<String>();

        empNames.add("sudheer");
        empNames.add("kumar");
        empNames.add("surendra");
        empNames.add("kb");

        if(!empNames.isEmpty()){

            for(String emp:empNames){

                System.out.println(emp);
            }

            Collections.sort(empNames);

            System.out.println(empNames);
        }
    }
}