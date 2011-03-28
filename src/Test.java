import java.math.BigInteger;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import biz.futureware.mantisconnect.IssueData;
import biz.futureware.mantisconnect.MantisConnectLocator;
import biz.futureware.mantisconnect.MantisConnectPortType;
import biz.futureware.mantisconnect.ProjectData;


public class Test {
	private static final String USER = "apiuser";
	private static final String PWD = "Crp97.zogt";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MantisConnectLocator loc = new MantisConnectLocator();
		try {
			loc.setMantisConnectPortEndpointAddress("http://localhost/~philip/bugtracker/api/soap/mantisconnect.php");
			MantisConnectPortType port = loc.getMantisConnectPort();
			ProjectData[] data = port.mc_projects_get_user_accessible(USER, PWD);
			for(int i=0;i<data.length;i++){
				ProjectData dat = data[i];
				System.out.println(dat.getName() +"(" +dat.getId() +"): " +dat.getDescription());
			}
			System.out.println("\n\n");
			IssueData[] issues = port.mc_project_get_issues(USER, PWD, new BigInteger("1"), new BigInteger("0"), new BigInteger("0"));
			for (int i = 0; i < issues.length; i++) {
				IssueData issueData = issues[i];
				System.out.println(issueData.getSummary()+"(" +issueData.getStatus().getName() +"): " +issueData.getDescription());
				System.out.println("--------------------------------------------------------------------------------------------------------");
			}
			
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
