package Day36;

import org.testng.annotations.Test;

/*
loginByEmail  - sanity & regression
loginByfacebook - sanity
loginBytwitter  - sanity

signupbyemail - sanity & regression
signupbyfacebook  - regression
signupbytwitter  - regression

paymentinrupees - sanity & regression
paymentindollar - sanity  
paymentReturnbyBank  - regression
*/

public class Grouping {

	@Test(priority=1,groups= {"sanity", "regression"})
    void loginByEmail()
    {
    	System.out.println("This is login by email");
    }
	@Test(priority=2, groups= {"sanity"})
    void loginByfacebook()
    {
    	System.out.println("This login by facebook");
    }
    
	@Test(priority=3, groups= {"sanity"})
    void loginBytwitter()
    {
    	System.out.println("This is login by twitter");
    }
	
	@Test(priority=4, groups= {"sanity", "regression"})
        void signupbyemail()
        {
        	System.out.println("Sign up by email");
        }
        
	@Test(priority=5, groups= {"regression"})
        void signupbyfacebook()
        {
        	System.out.println("Signup by facebook");
        }
	
	@Test(priority=6, groups= {"regression"})
        void signupbytwitter()
        {
        	System.out.println("signup b twitter");
        }
	
	
	@Test(priority=7, groups= {"sanity", "regression"})
        void paymentindollar()
        {
        	System.out.println("This is payment by dollar method");
        }
	
	@Test(priority=8, groups= {"sanity"})
        void paymentinrupees()
        {
        	System.out.println("This is payment by rupee method");
        }
	
	@Test(priority=9, groups= {"regression"})
        void PaymentreturnBank()
        {
        	System.out.println("payment return by bank");
        }
        
	
}
