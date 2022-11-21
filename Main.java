class Main {
  public static void main(String[] args) {

    Guitar g = new Guitar();
    
    log(g.bass(12));
    log(g.bass(4, "deep sounds!"));
    log(g.bass(9, "clanging sounds", 30));
  }

  public static void log(Object message) {
    System.out.println(message);
  }
}