package com.rocketseat.planner.participant;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collector;

public record ParticipantsData(UUID id, String nome, String email, Boolean isConfirmed) {

}
