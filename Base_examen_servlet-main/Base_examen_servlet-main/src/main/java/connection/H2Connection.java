package connection;

public class H2Connection extends AbstractConnection {

	@Override
	public String getDriver() {
		return "org.h2.Driver";
	}

	@Override
	public String getDatabaseUser() {
		return "root";
	}

	@Override
	public String getDatabasePassword() {
		return "root120";
	}

}
