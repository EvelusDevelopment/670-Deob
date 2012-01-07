
final class uj {

   static Object[] f = ed.a(1, new Object[1], (byte)-113, 11);
   static cga[] b;
   static Object[][] a;
   static int d;
   static int c;
   static int e;


   static final boolean a(int var0, Object[] var1) throws oqa {
      ++e;
      if(null != var1 && var1.length == 10) {
         return true;
      } else {
         var1[9] = fk.a("Sprite", 5846, (Object[])((Object[])var1[0]));
         var1[20] = kt.a(-18810, (Object[])((Object[])var1[9]), "WVPMatrix");
         var1[18] = kt.a(-18810, (Object[])((Object[])var1[9]), "SpriteSampler");
         var1[10] = kt.a(-18810, (Object[])((Object[])var1[9]), "MaskSampler");
         var1[13] = kt.a(-18810, (Object[])((Object[])var1[9]), "MulColour");
         var1[19] = kt.a(-18810, (Object[])((Object[])var1[9]), "AddColour");
         var1[11] = kt.a(-18810, (Object[])((Object[])var1[9]), "SpriteTexCoordMatrix");
         if(var0 != 29207) {
            return ((boolean[])((boolean[])f[41]))[2];
         } else {
            var1[17] = kt.a(-18810, (Object[])((Object[])var1[9]), "MaskTexCoordMatrix");
            var1[15] = lca.a((Object[])((Object[])var1[9]), (byte)117, "Normal");
            var1[12] = lca.a((Object[])((Object[])var1[9]), (byte)117, "Masked");
            lca.a((Object[])((Object[])var1[9]), (byte)117, "AlphaTex");
            an.a((Object[])((Object[])var1[15]), (Object[])((Object[])var1[9]), true);
            return true;
         }
      }
   }

   static final void a(Object[] var0, int var1) {
      if(var1 >= -115) {
         a = (Object[][])((Object[][])null);
      }

      ((int[])((int[])var0[1]))[3] = -1;
      ((boolean[])((boolean[])var0[2]))[1] = true;
      ++d;
   }

   static final boolean a(Object[] var0, boolean var1) {
      ++c;
      ui.a((Object[])((Object[])var0[0]), ((int[])((int[])var0[1]))[0], ((int[])((int[])var0[1]))[1], (int[])((int[])var0[6]), (float[])((float[])var0[2]));
      ((boolean[])((boolean[])var0[4]))[0] = var1;
      return true;
   }

}
