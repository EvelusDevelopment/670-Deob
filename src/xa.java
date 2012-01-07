
final class xa extends hsa {

   private int o = 0;
   private int n = 0;
   private ia p;
   private ga m = null;
   private Class_o f_l = null;


   final void a(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      long var9 = 0L;
      long var11 = 0L;
      if(this.m == null) {
         var7 = false;
      } else {
         var9 = this.m.nativeid;
      }

      if(this.f_l == null) {
         var8 = false;
      } else {
         var11 = this.f_l.nativeid;
      }

      this.BA(this.p.nativeid, var9, var11, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   private final native void BA(long var1, long var3, long var5, int var7, int var8, int var9, int var10, int var11, int var12, boolean var13, boolean var14);

   final void a(int var1, re var2) {
      if(var1 != 0) {
         throw new RuntimeException();
      } else if(this.f_l != null && var2 != null && (this.f_l.c() != var2.c() || this.f_l.b() != var2.b())) {
         throw new RuntimeException();
      } else {
         this.m = (ga)var2;
         if(var2 != null) {
            this.n = var2.c();
            this.o = var2.b();
         } else if(this.f_l == null) {
            this.n = 0;
            this.o = 0;
         }

         if(this.p.e(30626) == this) {
            this.a();
         }

      }
   }

   final int d() {
      return this.o;
   }

   final int e() {
      return this.n;
   }

   final void c() {}

   final boolean b() {
      return true;
   }

   final void a(lua var1) {
      if(this.m != null && var1 != null && (this.m.c() != var1.c() || this.m.b() != var1.b())) {
         throw new RuntimeException();
      } else {
         this.f_l = (Class_o)var1;
         if(var1 != null) {
            this.n = var1.c();
            this.o = var1.b();
         } else if(this.m == null) {
            this.n = 0;
            this.o = 0;
         }

         if(this.p.e(30626) == this) {
            this.a();
         }

      }
   }

   final boolean f() {
      return true;
   }

   xa(ia var1) {
      this.p = var1;
   }

   final boolean a() {
      this.p.da(this.m == null?0L:this.m.nativeid, this.f_l == null?0L:this.f_l.nativeid);
      return true;
   }
}
