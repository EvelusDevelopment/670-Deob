package jaclib.memory;

import jaclib.memory.Buffer;

public final class Stream {

   private int c;
   private Buffer e;
   public static boolean b = ~getLSB(-65536) == 0;
   private int f;
   private int a;
   private byte[] d;


   public Stream(Buffer var1, int var2, int var3) {
      this(4096 <= var1.a()?4096:var1.a());
      this.a(var1, var2, var3);
   }

   public final void b(int var1) {
      if(this.a >= this.d.length) {
         this.b();
      }

      this.d[this.a++] = (byte)var1;
   }

   public final void c(int var1) {
      if(~this.d.length >= ~(3 + this.a)) {
         this.b();
      }

      this.d[this.a++] = (byte)(var1 >> 16);
      this.d[this.a++] = (byte)(var1 >> 8);
      this.d[this.a++] = (byte)var1;
      this.d[this.a++] = (byte)(var1 >> 24);
   }

   public final void b(float var1) {
      if(~(this.a + 3) <= ~this.d.length) {
         this.b();
      }

      int var2 = floatToRawIntBits(var1);
      this.d[this.a++] = (byte)(var2 >> 24);
      this.d[this.a++] = (byte)(var2 >> 16);
      this.d[this.a++] = (byte)(var2 >> 8);
      this.d[this.a++] = (byte)var2;
   }

   private static final native byte getLSB(int var0);

   private final void a(Buffer var1, int var2, int var3) {
      try {
         this.b();
         this.e = var1;
         this.c = var2;
         this.f = var3 + var2;
         if(this.f > var1.a()) {
            throw new RuntimeException();
         }
      } catch (RuntimeException var5) {
         throw var5;
      }
   }

   public final void d(int var1) {
      this.b();
      this.c = var1;
   }

   public Stream() {
      this(4096);
   }

   public Stream(Buffer var1) {
      this(var1, 0, var1.a());
   }

   public final int a() {
      return this.a + this.c;
   }

   public final void b() {
      try {
         if(this.a > 0) {
            if(~this.f > ~(this.a + this.c)) {
               throw new RuntimeException();
            }

            this.e.a(this.d, 0, this.c, this.a);
            this.c += this.a;
            this.a = 0;
         }

      } catch (RuntimeException var2) {
         throw var2;
      }
   }

   public static final native int floatToRawIntBits(float var0);

   public final void a(int var1) {
      if(~this.d.length >= ~(this.a + 3)) {
         this.b();
      }

      this.d[this.a++] = (byte)var1;
      this.d[this.a++] = (byte)(var1 >> 8);
      this.d[this.a++] = (byte)(var1 >> 16);
      this.d[this.a++] = (byte)(var1 >> 24);
   }

   private Stream(int var1) {
      this.d = new byte[var1];
   }

   public final void a(float var1) {
      if(~this.d.length >= ~(this.a + 3)) {
         this.b();
      }

      int var2 = floatToRawIntBits(var1);
      this.d[this.a++] = (byte)var2;
      this.d[this.a++] = (byte)(var2 >> 8);
      this.d[this.a++] = (byte)(var2 >> 16);
      this.d[this.a++] = (byte)(var2 >> 24);
   }

}
