package lista07.exercicio07;


class PrintJob {
    private final String jobId;
    private final String description;

    public PrintJob(String jobId, String description) {
        this.jobId = jobId;
        this.description = description;
    }

    public String getJobId() {
        return jobId;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Job ID: " + jobId + ", Description: " + description;
    }
}
