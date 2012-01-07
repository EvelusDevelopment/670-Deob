import java.awt.Canvas;
import java.awt.Dimension;

final class Class_c extends gv implements Class_w {

   private int p;
   private ia f_l;
   long nativeid;
   private static boolean o = false;
   private static long m;
   private int n;
   private Canvas k;


   final void c() {
      if(this.f_l.e(30626) == this) {
         this.b();
      }

      this.o(true);
      this.nativeid = 0L;
      this.k = null;
   }

   final boolean b() {
      return true;
   }

   private final native void YA(int var1, int var2, int var3, int var4);

   final int f() {
      return this.a(0, 0);
   }

   final int a(int var1, int var2) {
      try {
         synchronized(this.k.getTreeLock()) {
            Dimension var4 = this.k.getSize();
            this.YA(var1, var2, var4.width, var4.height);
            o = false;
            return 0;
         }
      } catch (Exception var7) {
         this.a(var7);
         return -1;
      }
   }

   private final native void ja(ia var1, Canvas var2, int var3, int var4);

   private final void a(Exception var1) {
      if(!o) {
         m = he.a(98);
         o = true;
      } else {
         if(he.a(67) - m >= 30000L) {
            throw new RuntimeException(var1.getMessage());
         }

         this.k.repaint();
      }

   }

   final int d() {
      return this.n;
   }

   final boolean a() {
      this.f_l.n(this);
      return true;
   }

   private final native void xa(Canvas var1, int var2, int var3);

   Class_c(ia var1, Canvas var2, int var3, int var4) {
      this.f_l = var1;
      this.k = var2;
      this.p = var3;
      this.n = var4;
      this.ja(var1, this.k, var3, var4);
   }

   protected final void finalize() {
      if(this.nativeid != 0L) {
         lla.a(-109, this);
      }

   }

   public final native void o(boolean var1);

   final void b(int var1, int var2) {
      this.p = var1;
      this.n = var2;
      this.xa(this.k, var1, var2);
      if(this.f_l.e(30626) == this) {
         this.a();
      }

   }

   final int e() {
      return this.p;
   }

}
