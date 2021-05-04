package boardgame;

public class Board {
	
	private Integer rows;
	private Integer columns;
	private Piece[][] pieces;
	
	public Board(Integer rows, Integer columns) {
		if(rows < 1 || columns < 1) {
			throw new BoardExeption("Erro criando tabuleiro: � necess�rio ter pelo menos 1 linha e uma coluna");
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
			throw new BoardExeption("Posi��o n�o existente!");			
		}
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		if(!positionExists(position.getRow(), position.getColumn())) {
			throw new BoardExeption("Posi��o n�o existente!");			
		}
		return pieces[position.getRow()][position.getColumn()];		
	}	
	
	public void placePiece(Piece piece, Position position) {
		if(thereIsAPiece(position)) {
			throw new BoardExeption("J� tem uma pe�a na posi��o: " + position);			
		}		
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	public Piece removePiece(Position position) {
		if(!positionExists(position)) {
			throw new BoardExeption("Posi��o n�o existente!");			
		}
		if (piece(position) == null) {
			return null;
		}
		Piece aux = piece(position);
		aux.position = null;
		pieces[position.getRow()][position.getColumn()] = null;	
		
		return aux;
	}
	
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}	
	
	public boolean thereIsAPiece(Position position) {
		
		if(!positionExists(position)) {
			throw new BoardExeption("Posi��o n�o existente!");			
		}					
		return piece(position) != null;		
	}
}
