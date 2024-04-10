import java.util.Scanner;

// color of a chess piece
enum Color {
    WHITE, BLACK
}

// type of a chess piece
enum PieceType {
    PAWN, ROOK, KNIGHT, BISHOP, QUEEN, KING
}


class Piece {
    private Color color;
    private PieceType type;

    public Piece(Color color, PieceType type) {
        this.color = color;
        this.type = type;
    }

    public Color getColor() {
        return color;
    }

    public PieceType getType() {
        return type;
    }
}

// representing a chess board
class Board {
    private Piece[][] squares;

    public Board() {
        squares = new Piece[8][8];
    }

    public void placePiece(int x, int y, Piece piece) {
        squares[x][y] = piece;
    }

    public Piece getPiece(int x, int y) {
        return squares[x][y];
    }

  
}


class Player {
    private Color color;

    public Player(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    
}

public class ChessGame {
    private Board board;
    private Player whitePlayer;
    private Player blackPlayer;

    public ChessGame() {
        board = new Board();
        whitePlayer = new Player(Color.WHITE);
        blackPlayer = new Player(Color.BLACK);
        initializeBoard();
    }

    private void initializeBoard() {
        
        for (int i = 0; i < 8; i++) {
            board.placePiece(1, i, new Piece(Color.WHITE, PieceType.PAWN));
            board.placePiece(6, i, new Piece(Color.BLACK, PieceType.PAWN));
        }
       
    }

    public void printBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Piece piece = board.getPiece(i, j);
                if (piece != null) {
                    System.out.print(piece.getType().name().charAt(0));
                } else {
                    System.out.print("-");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ChessGame game = new ChessGame();
        game.printBoard();
    }
}