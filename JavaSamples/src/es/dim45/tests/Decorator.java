package es.dim45.tests;

public class Decorator {
    public static void main(String[] args) {
        Developer developer = new JavaTeamLead(
                new SeniorJavaDeveloper(
                        new JavaDeveloper()));

        System.out.println(developer.makeJob());
    }

    interface Developer {
        public String makeJob();
    }

    class JavaDeveloper implements Developer {
        public String makeJob() {
            return "Write Java Code.";
        }
    }

    class DeveloperDecorator implements Developer {
        private Developer developer;

        public DeveloperDecorator(Developer developer) {
            this.developer = developer;
        }

        public String makeJob() {
            return developer.makeJob();
        }
    }

    class SeniorJavaDeveloper extends DeveloperDecorator {

        public SeniorJavaDeveloper(Developer developer) {
            super(developer);
        }

        public String makeCodeReview() {
            return "Make code review.";
        }

        public String makeJob() {
            return super.makeJob() + " " + makeCodeReview();
        }
    }

    class JavaTeamLead extends DeveloperDecorator {

        public JavaTeamLead(Developer developer) {
            super(developer);
        }

        public String sendWeekReport() {
            return "Send week report to customers.";
        }

        public String makeJob() {
            return super.makeJob() + " " + sendWeekReport();
        }
    }
}
