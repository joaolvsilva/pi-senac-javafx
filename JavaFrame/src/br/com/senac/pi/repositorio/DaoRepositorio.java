package br.com.senac.pi.repositorio;

import java.util.List;

public interface DaoRepositorio<T> {
    List<T> getAll();
    void inserir(T entidade);
    
}
