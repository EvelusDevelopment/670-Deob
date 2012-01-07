
final class cg {

   static int e;
   static int c;
   static int a;
   static int d;
   static int b;


   static final jqa a(int var0, Object[] var1) {
      if(var0 != -32457) {
         c = 77;
      }

      ++a;
      return var1 != null?cw.a((byte)104, var1):an.a(var1, -81);
   }

   static final void a(Object[] var0, byte var1) {
      if(var1 != -107) {
         c = -55;
      }

      ++e;
      Object[] var2 = jh.a(((int[])((int[])((Object[])((Object[])var0[2]))[1]))[5], false, (Object[])((Object[])var0[3]));
      var0[0] = lna.g.a(var2, aea.a((Object[])((Object[])var0[5]), ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[5]), true);
   }

   static final void b(Object[] var0, byte var1) {
      if(var1 != 114) {
         b((Object[])null, (byte)115);
      }

      pi.b((Object[])((Object[])var0[0]), false, var0);
      ++b;
   }

   static final void c(Object[] var0, byte var1) {
      ++d;
      if(var1 < 126) {
         c = 105;
      }

      int var4 = 0;
      boolean var5 = false;
      Object[] var6 = vk.f;

      ica var2;
      ica var3;
      for(Object[] var7 = (var2 = (ica)dda.a((Object[])((Object[])var0[3]), 2)) != null?var2.m:null; var7 != null; var7 = null != (var3 = (ica)client.a((Object[])((Object[])var0[3]), -28280))?var3.m:null) {
         Object[] var8 = uf.a(var7, (byte)-72);
         if(((int[])((int[])var8[0]))[1] > ((int[])((int[])var6[0]))[1]) {
            var6 = var8;
         }

         boolean var10 = false;
         var5 |= var10;
         var4 += lq.a((byte)-60, var7);
      }

      if(var0[4] != var6) {
         ((boolean[])((boolean[])var0[0]))[1] = true;
         var0[4] = var6;
      }

      int var11 = 2 >= ((int[])((int[])var0[1]))[2]?((int[])((int[])var0[1]))[2]:2;
      int var12 = 2 >= var4?var4:2;
      ((int[])((int[])var0[1]))[2] = var4;
      if(!((boolean[])((boolean[])var0[0]))[2] == var5) {
         ((boolean[])((boolean[])var0[0]))[4] = true;
         ((boolean[])((boolean[])var0[0]))[2] = var5;
      }

      if(var12 != var11) {
         ((boolean[])((boolean[])var0[0]))[0] = true;
         ((boolean[])((boolean[])var0[0]))[1] = true;
      }

   }

}
