
final class jda extends ja {

   static int B;
   static int D;
   private Object[] E;


   jda(Object[] var1, ta var2, Object[] var3) {
      super(var2, var3);
      this.E = var1;
   }

   static final void a(int var0, int[] var1, boolean var2, int var3, Object[] var4, int var5, int var6, int var7, int var8) {
      if(var2) {
         ++D;
         if(var4 != null && -16 == ~var4.length) {
            gla.a(0, var6, var3, var5, var8, var1, var4, var0, var7);
         } else {
            gla.a(0, var6, var3, var5, var8, var1, var4, var0, var7);
         }
      }
   }

   final void a(char var1, int var2, int var3, int var4, boolean var5, Class_s var6, int var7, int var8) {
      wj.a(this.E, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   static final void a(Object[] var0, byte var1) {
      if(var1 == -94) {
         ++B;
         po.b(var1 ^ 49, var0);
      }
   }

   final void HA(char var1, int var2, int var3, int var4, boolean var5) {
      wj.a(this.E, var1, var2, var3, var4, var5);
   }

}
