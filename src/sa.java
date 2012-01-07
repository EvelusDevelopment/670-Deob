
final class sa implements Class_w {

   Object[] d;
   Runnable b;
   private ia a;
   private Class_j[] c = new Class_j[7];
   long nativeid;
   private Class_j[] e = new Class_j[7];


   private final void a() {
      this.da(this.nativeid);
   }

   final void d() {
      this.b = Thread.currentThread();
      this.a();
   }

   final void a(ta var1, int[] var2, int[] var3, int[] var4, short[] var5, int var6) {
      this.J(this.nativeid, var1, var2, var3, var4, var5, var6);
   }

   private final native void da(long var1);

   private final native void I(long var1, ta var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10);

   private final native void ua(long var1, boolean var3);

   final void a(ka var1, ka var2, int var3, int var4, int var5, boolean var6) {
      this.ia(this.nativeid, ((Class_j)var1).nativeid, ((Class_j)var2).nativeid, var3, var4, var5, var6);
   }

   private final native void S(long var1, ta var3, int var4, int var5);

   private final native void fa(long var1, long var3, float[] var5, int[] var6, int var7);

   final ka a(Class_j var1, byte var2, int var3, boolean var4) {
      boolean var7 = false;
      Class_j var5;
      Class_j var6;
      if(var2 > 0 && var2 <= 7) {
         var6 = this.c[var2 - 1];
         var5 = this.e[var2 - 1];
         var7 = true;
      } else {
         var5 = var6 = new Class_j(this.a);
      }

      var1.ua(var5, var6, var3, var7, var4);
      var5.q = var1.q;
      var5.p = var1.p;
      return var5;
   }

   final void b() {
      this.b = null;
      this.c();
   }

   final void a(ta var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this.I(this.nativeid, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   final boolean a(ka var1, int var2, int var3, Object[] var4, boolean var5) {
      aqa.a(true, var4, this.d);
      return this.h(this.nativeid, ((Class_j)var1).nativeid, var2, var3, (float[])((float[])this.d[0]), var5);
   }

   private final native void ka(long var1, long var3, int var5, int var6);

   private final native void s(long var1);

   private final native void J(long var1, ta var3, int[] var4, int[] var5, int[] var6, short[] var7, int var8);

   public final void o(boolean var1) {
      this.ua(this.nativeid, var1);
   }

   final void a(ka var1, int[] var2, Object[] var3) {
      aqa.a(true, var3, this.d);
      this.L(this.nativeid, ((Class_j)var1).nativeid, var2, (float[])((float[])this.d[0]));
   }

   private final native void ia(long var1, long var3, long var5, int var7, int var8, int var9, boolean var10);

   private final native boolean h(long var1, long var3, int var5, int var6, float[] var7, boolean var8);

   final void a(aa var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean[][] var9) {
      this.oa(this.nativeid, ((na)var1).nativeid, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   private final native void L(long var1, long var3, int[] var5, float[] var6);

   final void a(aa var1, int var2, int var3) {
      this.ka(this.nativeid, ((na)var1).nativeid, var2, var3);
   }

   final void a(ka var1, Object[] var2, int[] var3, int var4) {
      aqa.a(true, var2, this.d);
      this.fa(this.nativeid, ((Class_j)var1).nativeid, (float[])((float[])this.d[0]), var3, var4);
   }

   private final native void oa(long var1, long var3, int var5, int var6, int var7, int var8, int var9, int var10, int var11, boolean[][] var12);

   private final void c() {
      this.s(this.nativeid);
   }

   protected final void finalize() {
      if(this.nativeid != 0L) {
         lla.a(-113, this);
      }

   }

   sa(ia var1, int var2, int var3) {
      this.a = var1;

      for(int var4 = 0; var4 < 7; ++var4) {
         this.e[var4] = new Class_j(this.a);
         this.c[var4] = new Class_j(this.a);
      }

      this.d = ab.a(new Object[2], (byte)-112);
      this.S(this.nativeid, var1, var2, var3);
   }
}
