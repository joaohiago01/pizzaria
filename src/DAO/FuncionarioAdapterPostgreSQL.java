package DAO;

import java.util.ArrayList;

import DTO.FuncionarioDTO;
import View.FuncionarioNaoExisteException;

public class FuncionarioAdapterPostgreSQL extends FuncionarioDAOPostgreSQL implements FuncionarioDAO {

	@Override
	public ArrayList<ArrayList<String>> checkConnection() {
		return super.checkConnection();
	}

	@Override
	public void finishConnection(ArrayList<ArrayList<String>> tableFuncionario) {
		super.finishConnection(tableFuncionario);
	}

	@Override
	public void createFuncionario(FuncionarioDTO funcionarioDTO) {
		super.createFuncionario(funcionarioDTO);
	}

	@Override
	public void deleteFuncionario(FuncionarioDTO funcionarioDTO) throws FuncionarioNaoExisteException {
		super.deleteFuncionario(funcionarioDTO);
	}

	@Override
	public FuncionarioDTO readFuncionario(FuncionarioDTO funcionarioDTO) throws FuncionarioNaoExisteException {
		return super.readFuncionario(funcionarioDTO);
	}

	@Override
	public void updateFuncionario(FuncionarioDTO funcionarioDTO) {
		super.updateFuncionario(funcionarioDTO);
	}

	@Override
	public int IDFuncionario() {
		return super.IDFuncionario();
	}

	@Override
	public void closeConnection() {
		super.closeConnection();
	}

	
}
