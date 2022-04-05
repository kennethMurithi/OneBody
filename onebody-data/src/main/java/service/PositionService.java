package service;

import model.Position;

import java.util.Set;

public interface PositionService {

    Position findById(Long id);

    Position save(Position depertment);

    Set<Position> findAll();

}
