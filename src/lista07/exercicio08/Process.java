package lista07.exercicio08;


record Process(String processId, String description) {

    @Override
    public String toString() {
        return "Process ID: " + processId + ", Description: " + description;
    }
}

