public class User {

        private PersonalInformation pInfo;
        private int id;

        public User(PersonalInformation p, int number){
            pInfo = p;
            id = number;
        }

        public int  getId(){
            return id;
        }

        public PersonalInformation getpInfo(){
            return pInfo;
        }

        public String toString(){
            return ("Character " + " \"" +  getId() + " \"" + " has been created\n" + pInfo.toString());
        }



}
