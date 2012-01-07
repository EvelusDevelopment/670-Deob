
final class jj extends tha implements re, lua {

   static int y;
   static int u;
   static int v;
   static int B;
   static int A;
   Object[] t;
   static int w;
   static int z = -1;
   static int C;
   static int x;


   static final double a(int var0, Object[] var1) {
      ++w;
      if(var0 != 3) {
         a(-63, (Object[])null);
      }

      return ((double[])((double[])var1[3]))[0];
   }

   public final int c() {
      ++v;
      return tp.b(this.t, 2);
   }

   final void b(int var1) throws Throwable {
      super.finalize();
      if(var1 == 0) {
         ++y;
      }
   }

   public final void a() {
      jha.a(-95, this.t);
      ++A;
   }

   public final int b() {
      ++x;
      Object[] var2 = this.t;
      int var1 = ((int[])((int[])var2[1]))[0];
      return var1;
   }

   protected final void finalize() throws Throwable {
      ega.a(this.t, (byte)123);
      ++C;
   }

   static final void a(Object[] var0, Object[] var1, int var2) {
      ++B;
      if(var2 == -9835) {
         Object[] var11 = (Object[])((Object[])var0[2]);
         boolean var12 = true;
         if(var1 == null || var1.length != 2) {
            lpa[] var13 = (lpa[])((lpa[])((Object[])((Object[])var0[2]))[9]);

            for(int var14 = 0; var13.length > var14; ++var14) {
               if(var13[var14].k) {
                  var12 = false;
                  break;
               }
            }

            if(!var12) {
               var0[1] = var1;
               uq var4;
               Object[] var17;
               if(((boolean[])((boolean[])var1[2]))[0]) {
                  uq var3;
                  for(var17 = (var3 = (uq)om.a((Object[])((Object[])var1[0]), false)) != null?var3.f_l:null; var17 != null; var17 = (var4 = (uq)pw.a((Object[])((Object[])var1[0]), -82)) == null?null:var4.f_l) {
                     if(var11 == var17[2]) {
                        ((nj)(var17 != null?var17[0]:null)).a(1);
                        ie.a(var17, 23247);
                     }
                  }
               }

               uq var6;
               uq var7;
               for(var17 = null != (var6 = (uq)om.a((Object[])((Object[])var1[0]), false))?var6.f_l:null; var17 != null; var17 = null != (var7 = (uq)pw.a((Object[])((Object[])var1[0]), var2 ^ 9775))?var7.f_l:null) {
                  if(~((int[])((int[])((Object[])((Object[])var17[2]))[12]))[0] >= ~((int[])((int[])var11[12]))[0]) {
                     nj var15 = (nj)(null != var0?var0[0]:null);
                     nj var16 = (nj)(var17 == null?null:var17[0]);
                     if(null != var15.b) {
                        var15.a(1);
                     }

                     var15.b = var16.b;
                     var15.f = var16;
                     var15.b.f = var15;
                     var15.f.b = var15;
                     return;
                  }
               }

               gt.a((Object[])((Object[])var1[0]), -127, (nj)(var0 == null?null:var0[0]));
            }
         }
      }
   }

   jj(Object[] var1) {
      this.t = var1;
   }

}
