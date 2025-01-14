package Spring;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Doctor implements staff, BeanNameAware {

    private String Qualification;

    public String getQualification() {
        return Qualification;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "Qualification='" + Qualification + '\'' +
                '}';
    }

    public void setQualification(String qualification) {
        Qualification = qualification;
    }

    public void assits(){;

        System.out.println("doctor is ready");
}

    @Override
    public void setBeanName(String s) {
        System.out.println("bin is ready");
    }
}



