package fr.ippon.cwp;

import static org.junit.Assert.assertEquals;

import org.jboss.arquillian.junit.Arquillian;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.service.UserLocalServiceUtil;

@RunWith(Arquillian.class)
public class LiferayArquillianTest {

	@Test
	public void testUserCount() {
	    int count = 0;
		try {
			count = UserLocalServiceUtil.getUsersCount();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    Assert.assertEquals(103, count);
	}
	
    @Test
    public void testTermsOfUse() {
        String termsOfUseRequired = PropsUtil.get("terms.of.use.required");
        assertEquals("true", termsOfUseRequired);
    }

}