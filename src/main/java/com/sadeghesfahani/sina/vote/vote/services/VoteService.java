package com.sadeghesfahani.sina.vote.vote.services;

import com.sadeghesfahani.sina.vote.vote.repository.VoteRepository;
import org.springframework.stereotype.Service;

@Service
public class VoteService {
    private final VoteRepository voteRepository;

    public VoteService(VoteRepository voteRepository) {
        this.voteRepository = voteRepository;
    }
}
