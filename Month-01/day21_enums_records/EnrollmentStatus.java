package day21_enums_records;

import java.util.Optional;

public enum EnrollmentStatus {
    PENDING("Pending Approval"),
    ACTIVE("Active Enrollment"),
    SUSPENDED("Temporarily Suspended"),
    GRADUATED("Studies Completed");

    private final String description;

    EnrollmentStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static Optional<EnrollmentStatus> findByString(String statusStr) {
        if (statusStr == null) {
            return Optional.empty();
        }
        for (EnrollmentStatus status : values()) {
            if (status.name().equalsIgnoreCase(statusStr) || status.getDescription().equalsIgnoreCase(statusStr)) {
                return Optional.of(status);
            }
        }
        return Optional.empty();
    }
}
