package hellocucumber;

import cucumber.api.java.zh_cn.假设;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;

public class UserStoryZhSteps {
    @假设("^我有同事很懂Cucumber$")
    public void 我有同事很懂cucumber() throws Exception {
    }

    @当("^我让同事向我总体性地介绍Cucumber如何工作$")
    public void 我让同事向我总体性地介绍cucumber如何工作() throws Exception {
    }

    @当("^我听同事的解释$")
    public void 我听同事的解释() throws Exception {
    }

    @那么("^我应该对Cucumber有基本的了解$")
    public void 我应该对cucumber有基本的了解() throws Exception {
    }
}
