
final class ga extends cga implements Class_w, re {

   private boolean a = false;
   long nativeid;


   private final native int g(long var1);

   final int g() {
      return this.g(this.nativeid);
   }

   protected final void finalize() {
      if(this.nativeid != 0L) {
         lla.a(-45, this);
      }

   }

   private final native void m(ia var1, int var2, int var3, int var4, int var5, boolean var6);

   private final native void q(long var1, int var3, int var4, int var5);

   final int d() {
      return this.F(this.nativeid);
   }

   private final native void XA(long var1, int[] var3);

   final void a(int var1, int var2, Class_s var3, int var4, int var5) {
      this.L(this.nativeid, var1, var2, ((ua)var3).nativeid, var4, var5);
   }

   public final int b() {
      return this.g(this.nativeid);
   }

   final int f() {
      return this.ka(this.nativeid);
   }

   public final void a() {}

   private final native void ia(long var1, int var3, int var4, int var5, int var6, int var7, int var8, int var9);

   private final native int F(long var1);

   final void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.B(this.nativeid, var1, var2, var3, var4, var5, var6);
   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.ia(this.nativeid, var1, var2, var3, var4, var5, var6, var7);
   }

   private final native void R(ia var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7);

   public final int c() {
      return this.t(this.nativeid);
   }

   private final native void B(long var1, int var3, int var4, int var5, int var6, int var7, int var8);

   final void a(int var1, int var2, int var3) {
      this.q(this.nativeid, var1, var2, var3);
   }

   final void a(int var1, int var2, int var3, int var4) {
      this.E(this.nativeid, var1, var2, var3, var4);
   }

   private final native void L(long var1, int var3, int var4, long var5, int var7, int var8);

   private final native int t(long var1);

   final void a(float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10) {
      this.HA(this.nativeid, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   private final native void ca(ia var1, int[] var2, byte[] var3, byte[] var4, int var5, int var6, int var7, int var8);

   final void a(int var1, int var2, int var3, int var4, int var5) {
      this.f(this.nativeid, var1, var2, var3, var4, var5);
   }

   private final native void pa(long var1, float var3, float var4, float var5, float var6, float var7, float var8, int var9, long var10, int var12, int var13, boolean var14);

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this.b(this.nativeid, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   final void a(int[] var1) {
      this.XA(this.nativeid, var1);
   }

   private final native void E(long var1, int var3, int var4, int var5, int var6);

   public final void o(boolean var1) {
      this.la(this.nativeid, var1);
   }

   private final native int ka(long var1);

   private final native void f(long var1, int var3, int var4, int var5, int var6, int var7);

   private final native void la(long var1, boolean var3);

   final re h() {
      return this.a?this:null;
   }

   final int e() {
      return this.t(this.nativeid);
   }

   private final native void HA(long var1, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12);

   private final native void OA(ia var1, int var2, int var3);

   private final native void b(long var1, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10);

   final void a(float var1, float var2, float var3, float var4, float var5, float var6, int var7, Class_s var8, int var9, int var10) {
      this.pa(this.nativeid, var1, var2, var3, var4, var5, var6, var7, ((ua)var8).nativeid, var9, var10, this.a);
   }

   ga(ia var1, int var2, int var3, boolean var4) {
      this.a = var4;
      this.OA(var1, var2, var3);
   }

   ga(ia var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7) {
      this.R(var1, var2, var3, var4, var5, var6, var7);
   }

   ga(ia var1, int[] var2, byte[] var3, byte[] var4, int var5, int var6, int var7, int var8) {
      this.ca(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   ga(ia var1, int var2, int var3, int var4, int var5, boolean var6) {
      this.m(var1, var2, var3, var4, var5, var6);
   }
}
