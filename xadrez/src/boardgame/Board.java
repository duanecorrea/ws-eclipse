package boardgame;

public class Board {
	
	private Integer rows;
	private Integer columns;
	private Piece[][] pieces;
	
	public Board(Integer rows, Integer columns) {
		if(rows < 1 || columns < 1) {
			throw new BoardExeption("Erro criando tabuleiro: é necessário ter pelo menos 1 linha e uma coluna");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public Integer getRows() {
		return rows;
	}

	public Integer getColumns() {
		return columns;
	}
	
	public Piece piece(int row, int column) {
		if(!positionExists(row, column)) {
			throw new BoardExeption("Posição não existente!");			
		}
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		if(!positionExists(position.getRow(), position.getColumn())) {
			throw new BoardExeption("Posição não existente!");			
		}
		return pieces[position.getRow()][position.getColumn()];		
	}
	
	public void placePiece(Piece piece, Position position) {
		if(thereIsAPiece(position)) {
			throw new BoardExeption("Já tem uma peça na posição: " + position);			
		}		
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	public boolean positionExists(int row, int column) {
		return positionExists(new Position(row, column));		
	}
	
	public boolean positionExists(Position position) {
		
		return !(position.getRow() > rows || position.getColumn() > columns || position.getRow() < 0 || position.getColumn() < 0) ;		
	}
	
	public boolean thereIsAPiece(Position position) {
		
		if(!positionExists(position.getRow(), position.getColumn())) {
			throw new BoardExeption("Posição não existente!");			
		}		
		return piece(position) != null;		
	}
}
