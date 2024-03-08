import javax.validation.constraints.Pattern;

public class RegrexDemo {

	@Pattern(regexp="([A-Z]){8,50}([@_])([a-z]){8,50}(.)[a-zA-z]{3,5}")
	private String email;
	
	@Pattern(regexp="([A-Z])([a-z])([@_]){8,50}")
	private String password;
	
	@Pattern(regexp="([A-Z])([a-z])([@_]){8,50}")
	private String username;

	
	

	@Pattern(regexp = "(https?)://[a-zA-Z0-9](\\.[a-zA-Z0-9]){2,}")
	private String websiteURL;

	
	@Pattern(regexp="([a-z])[A-Z][0-9]")
	private String CustomerId;
	
	@Pattern(regexp="([0-9]){10,12}")
	private String mobilePhone;
	
	@Pattern(regexp="([0-9]){10,12}")
	private String homePhone;
	
	@Pattern(regexp="([0-9]){10,12}")
	private String workPhone;
	
	@Pattern(regexp = "[0-9]{16}")
	private String creditCardNumber;




}

