class StudentDetails
{
    public String Reg;
    public String name;
    public String email;
    public String address;
    

    public StudentDetails(String reg, String name, String email, String address)
    {
        this.Reg = reg;
        this.name = name;
        this.email = email;
        this.address = address;
        this.aadhar = aadhar;
    }

    public static boolean onlyDigits(String str, int n)
    {

        for (int i = 0; i < n; i++) 
        {
            if (Character.isDigit(str.charAt(i))) {
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }
    public static boolean validmob(String str)
    {
        if(str.length() != 10)
            return false;
        
        if(!onlyDigits(str, 10))
        {
            return false;
        }
        return true;
    }
    public static boolean validpass(String str)
    {
        if(str.length() != 7)
        {
            return false;
        }
        if(!onlyDigits(str.substring(1, str.length()),6))
            return false;

        if(Character.isLowerCase(str.charAt(0)))
            return false;

        return true;
    }
    static void validatemob(String str)throws InvalidMobileNumberException{  
        if(!validmob(str))  
         throw new InvalidMobileNumberException("Mobile Number not valid");   
      } 

      static void validatepass(String str)throws InvalidPassportNumberException{  
        if(!validpass(str))  
         throw new InvalidPassportNumberException("Passport Number not valid");   
      }

    public static void main(String[] args)
    {
        
        StudentDetails st = new StudentDetails("19BCE0931", "Aditya", "012345678A", "Ab23456", "gasvja");
        try {
            validatemob(st.mob);
        validatepass(st.passport);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}