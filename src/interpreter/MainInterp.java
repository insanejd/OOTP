package interpreter;

public class MainInterp {

    public static void main(String args[]) {
        Expression isJavaJPAANDHibernate = getJavaFMExpression();
        Expression isJavaSpring = getJavaSpringExpression();

        System.out.println("Does engineer knows Java or Spring: " + isJavaSpring.interpret("Java, Spring"));
        System.out.println("Does engineer knows Java JPA and Hibernate: " + isJavaJPAANDHibernate.interpret("JPA, Hibernate, Spring"));
    }

    public static Expression getJavaSpringExpression() {
        Expression java = new TerminalExp("Java");
        Expression spring = new TerminalExp("Spring");

        return new OrExp(java, spring);
    }

    public static Expression getJavaFMExpression() {
        Expression hibernate = new TerminalExp("Hibernate");
        Expression JPA = new TerminalExp("JPA");

        return new AndExp(hibernate, JPA);
    }

}
