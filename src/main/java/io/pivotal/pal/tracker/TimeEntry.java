package io.pivotal.pal.tracker;

import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class TimeEntry {
    private long id;
    @NonNull
    private long projectId;
    @NonNull
    private long userId;
    @NonNull
    private LocalDate date;
    @NonNull
    private int hours;
}
