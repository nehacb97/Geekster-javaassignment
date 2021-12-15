class Sports
{
    String getName()
    {
        return "Generic Sports";
    }
    void getNumberOfTeamMembers()
    {
        System.out.println( "Each team has n players in " + getName() );
    }
    public static void main(String args[])
    {
      Sports s = new Sports();
      Soccer sc = new Soccer();
      sc.getName();
      sc.getNumberOfTeamMembers();
    }
}
 
class Soccer extends Sports{
    @Override
    String getName()
    {
        return "Soccer Class";
    }
    @Override
    void getNumberOfTeamMembers()
    {
        int n=11;
        System.out.println( "Each team has " +n+" players in " + getName() );
    }
}
