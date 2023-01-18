public class TVActorDriver {
        public static void main(String[] args) {
            
            TVActor a = new TVActor();
            a.name = "Thomas Middleditch";
            a.role = "Richard Hendricks";
            a.age = 9;


            TVActor b = new TVActor();
            b.name = "Matrin Starr";
            b.role = "Bertram Gilfoyle";
            b.age = 11;

            TVActor c = new TVActor();
            c.name = "Dinesh";
            c.role = "Kumail";
            b.age = 65;

            System.out.println(a.name + " played " + a.role + "  and his age is " + a.age);
            System.out.println(b.name + " played " + b.role);
            System.out.println(c.name + " played " + c.role);
        }
}
